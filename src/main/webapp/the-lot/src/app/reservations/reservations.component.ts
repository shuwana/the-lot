import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-reservations',
  standalone: true,
  imports: [
    CommonModule
  ],
  templateUrl: './reservations.component.html',
  styleUrl: './reservations.component.css'
})
export class ReservationsComponent {
  currentPage: string = 'reservations';
}
