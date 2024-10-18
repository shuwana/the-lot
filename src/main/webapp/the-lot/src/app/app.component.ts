import { Component } from '@angular/core';
import { RouterOutlet, RouterLink, RouterLinkActive, } from '@angular/router';
import { FirstComponent } from './first/first.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterLink, RouterLinkActive, FirstComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']

})
//   @Component({
//   selector: 'app-login',
//   templateUrl: './app.component.html',
//   styleUrl: './app.component.css'

// })
  
export class AppComponent {
  title = 'the-lot';
}



