import { Component, OnInit } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-deletebook',
  templateUrl: './deletebook.component.html',
  styleUrls: ['./deletebook.component.css']
})
export class DeletebookComponent implements OnInit {
  errors : string;
  constructor(private auth: AuthServiceService, private router: Router) { }
  ngOnInit() {
  }
  getBookinfo(form : NgForm){
    this.errors = null;
    console.log(form.value);
    this.auth.deletebook(form.value).subscribe(data => {
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
