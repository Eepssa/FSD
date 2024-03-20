import { useState } from "react";

function Meaning() {
  const [word, setWord] = useState("");
  const [meanings, setMeanings] = useState([]);
  const [audio, setAudio] = useState("");

  const findMeaning = () => {
    fetch(`https://api.dictionaryapi.dev/api/v2/entries/en/${word}`)
      .then((response) => response.json())
      .then((data) => {
        const meaningAr = data[0].meanings;
        setMeanings(meaningAr);
        setAudio(data[0].phonetics[0].audio);
      });
  };

  const audioPlaying = () => {
    if (audio) {
      const aud = new Audio(audio);
      aud.play();
    }
  };

  return (
    <>
      <div className="input-group">
        <div className="form-outline" data-mdb-input-init>
          <input
            type="text"
            placeholder="Start typing any word"
            value={word}
            onChange={(e) => setWord(e.target.value)}
          />
        </div>

        <button
          type="button"
          className="btn btn-primary"
          data-mdb-ripple-init
          onClick={findMeaning}
        >
          Search
        </button>
        
        {audio && (
          <div>
            <button
              onClick={audioPlaying}
              className="btn btn-secondary"
              style={{ marginLeft: "10px" }}
            >
              Play Audio
            </button>
          </div>
        )}
      </div>

      <div>
        {meanings.map((meaning, index) => (
          <div key={index}>
            <div
              style={{
                border: "3px solid black",
                marginTop: "10px",
                marginBottom: "10px",
              }}
            >
              <h2 style={{ textAlign: "center" }}>
                Meanings as {meaning.partOfSpeech}
              </h2>
              <ul>
                {meaning.definitions.map((definition, ind) => (
                  <li key={ind}>
                    {definition.definition}
                    <br />
                  </li>
                ))}
              </ul>
            </div>
          </div>
        ))}
      </div>
    </>
  );
}

export default Meaning;
