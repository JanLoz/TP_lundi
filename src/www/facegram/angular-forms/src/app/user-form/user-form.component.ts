import { Component, OnInit } from '@angular/core';
import { User } from '../user';


@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent  {

 email = ['janeth@gmail;com', 'thoma@gmail.com', 'claudia@gmailcom'];
  model = new User(1, 'Janeth', 'Lozano', this.email[0]);


  submitted = false;

  onSubmit() { this.submitted = true; }

  // TODO: Remove this when we're done
  get diagnostic() { return JSON.stringify(this.model); }

  newUser() {
    this.model = new User(3, '', '', '');
  }

}
