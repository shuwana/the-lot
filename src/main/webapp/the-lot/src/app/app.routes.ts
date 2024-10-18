import { Routes } from '@angular/router';
import {FirstComponent} from './first/first.component';
import { LoginComponent } from './Login/login.component';
import {SecondComponent} from './second/second.component';

export const routes: Routes = [
  { path: 'first-component', component: FirstComponent },
  { path: 'second-component', component: SecondComponent },
  { path: 'login', component: LoginComponent },
];




