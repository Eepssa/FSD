import React, { useState, useEffect } from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faEdit, faTrash } from "@fortawesome/free-solid-svg-icons";
import { useForm } from "react-hook-form";
import { useNavigate } from "react-router-dom";

const Post = () => {
  const [postData, setPostData] = useState([]);
  const [error, setError] = useState("");
  const [uId, setUId] = useState("");
  const {
    register,
    handleSubmit,
    formState: { errors },
    reset,
  } = useForm();
  const navigate = useNavigate();

  useEffect(() => {
    // Retrieve user ID from localStorage
    const userId = localStorage.getItem("userId");
    if (!userId) {
      setError("User ID not found");
      navigate("../");
    }
    setUId(userId);

    fetch(`http://localhost:9002/post`)
      .then((response) => {
        if (!response.ok) {
          throw new Error("Failed to fetch post data");
        }
        return response.json();
      })
      .then((data) => {
        let posts: any[] = [];

        for (let post of data) {
          if (post.u_id == userId) posts.push(post);
        }

        return Promise.all(posts);
      })
      .then((posts) => {
        let updatedPosts: any[] = [];

        for (let post of posts) {
          fetch("http://localhost:9002/postimg/" + post.image)
            .then((response) => response.blob())
            .then((data) => {
              post.image = URL.createObjectURL(data);

            });

          updatedPosts.push(post);
        }

        return Promise.all(updatedPosts);
      })
      .then((updatedPosts: any) => {
        setPostData(updatedPosts);
      });
  }, []);


  //Post new details
  const onSubmit = async (formData) => {
    const { newPostText, newPostImage } = formData;
    const formDataObj = new FormData();
    formDataObj.append("file", newPostImage[0]);
    formDataObj.append("text", newPostText);

    try {
      const response = await fetch(`http://localhost:9002/post/upload/${uId}`, {
        method: "POST",
        body: formDataObj,
      });

      if (!response.ok) {
        throw new Error("Failed to add post");
      }

      // Reset form fields on successful submission
      reset();
    } catch (error) {
      setError("Failed to add post");
    }
    navigate("../post");
  };

  //Logout
  const logout = () => {
    localStorage.removeItem("userid");
    navigate("../");
  };

  return (
    <>
      <div style={{ backgroundColor: "lightblue" }}>
        <h2 style={{ textAlign: "right" }}>User Id: {uId}</h2>
        {error && <div style={{ color: "red" }}>{error}</div>}
        <form
          onSubmit={handleSubmit(onSubmit)}
          style={{
            border: "2px solid black",
            backgroundColor: "white",
            marginLeft: "10px",
            marginTop: "10px",
            marginRight: "10px",
          }}
        >
          <div
            style={{
              marginLeft: "10px",
              marginTop: "10px",
              marginBottom: "10px",
            }}
          >
            <h2 style={{ textAlign: "center" }}>Post New Details</h2>
            <label htmlFor="newPostText">Post Text: </label>
            <input
              type="text"
              id="newPostText"
              {...register("newPostText", { required: true })}
            />
            {errors.newPostText && <span>This field is required</span>}
          </div>
          <div style={{ marginLeft: "10px", marginBottom: "10px" }}>
            <label htmlFor="newPostImage">Post Image: </label>
            <input
              type="file"
              id="newPostImage"
              {...register("newPostImage", { required: true })}
            />
            {errors.newPostImage && <span>This field is required</span>}
          </div>
          <button
            type="submit"
            style={{ marginLeft: "10px", marginBottom: "10px" }}
          >
            Submit
          </button>
        </form>
        <br />
        {/* Display existing posts */}
           {postData.map((post, index) => {
            console.log(post);
            console.log(postData[index].image);
            return (
          
              <div
                key={index}
                style={{
                  border: "3px solid black",
                  marginBottom: "10px",
                  marginLeft: "10px",
                  marginRight: "10px",
                  backgroundColor: "white",
                }}
              >
                <div style={{ marginLeft: "10px", marginRight: "10px" }}>
                  <h3>{post.text}</h3>
                  <img src={post.image} alt="im" />
                </div>
                <br />
                <div>
                  {/* <FontAwesomeIcon icon={faEdit} onClick={() => handleEdit(post.id)} style={{ cursor: 'pointer', marginRight: '10px' }} />
                            <FontAwesomeIcon icon={faTrash} onClick={() => handleDelete(post.id)} style={{ cursor: 'pointer' }} /> */}
                </div>
                <br />
              </div>
            );
          })
        }
        <br />
        <button
          className="btn btn-primary btn-lg btn-block"
          style={{ marginBottom: "20px", marginLeft: "20px" }}
          onClick={logout}
        >
          Log out
        </button>
      </div>
    </>
  );
};

export default Post;
