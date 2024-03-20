import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AuthguardService } from './authguard.service';

export const routes: Routes = [
    {path:"", component:LoginComponent},
    {path:"login", component:LoginComponent},
    {path:"dashboard", component:DashboardComponent,canActivate:[AuthguardService]}
];
