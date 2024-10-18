import { Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ReservationsComponent } from './reservations/reservations.component';
import { PricingComponent } from './pricing/pricing.component';
import { MembersComponent } from './members/members.component';

export const routes: Routes = [
    { path: 'dashboard', component: DashboardComponent },
    { path: 'reservations', component: ReservationsComponent },
    { path: 'pricing', component: PricingComponent },
    { path: 'members', component: MembersComponent },
    { path: '',   redirectTo: '/dashboard', pathMatch: 'full' }, 
];
