import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  errors: string;
  email: any;
  password: any;
  constructor(private auth: AuthServiceService, private router: Router) { }
  ngOnInit() {
  }

  submitData(form: NgForm){
    this.errors = null;
    console.log(form.value);
    this.auth.loginUser(form.value).subscribe(data => {
        console.log('Response of login', data);
          this.router. navigateByUrl ('/studenthome');
    }, err => {
      console.log(err);
      this.errors = err.error.message;
       });



}
}
