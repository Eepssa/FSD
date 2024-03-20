import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { AuthguardService } from './authguard.service';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [

   {path:"",component:HomeComponent},
   {path:"login",component:LoginComponent},
   {path:"prof",component:ProfileComponent,canActivate: [AuthguardService] }
];
