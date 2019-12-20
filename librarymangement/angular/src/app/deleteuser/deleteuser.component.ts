import { Component, OnInit } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-deleteuser',
  templateUrl: './deleteuser.component.html',
  styleUrls: ['./deleteuser.component.css']
})
export class DeleteuserComponent implements OnInit {
  errors : string;
  constructor(private auth: AuthServiceService, private router: Router) { }
  ngOnInit() {
  }
  getUserinfo(form : NgForm){
    this.errors = null;
    console.log(form.value);
    this.auth.deleteUser(form.value).subscribe(data => {
      console.log('Response of login', data);
      if(data && data.message === 'login Successful'){
        localStorage.setItem('userDetails', JSON.stringify(data));
        this.router.navigateByUrl('/');
      }
      form.reset();
    }, err => {
      console.log(err);
      this.errors = err.error.message;
       });
 


}
}
