import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterLink, RouterOutlet, RouterLinkActive } from '@angular/router';
import { AdminSidebarComponent } from "./admin-sidebar/admin-sidebar.component";
import { DashboardComponent } from "./dashboard/dashboard.component";
import { ReservationsComponent } from './reservations/reservations.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    RouterLink,
    RouterLinkActive,
    CommonModule,
    AdminSidebarComponent,
    ReservationsComponent,
    DashboardComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  currentPage: string = 'dashboard';
}
