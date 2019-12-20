import { Component, OnInit } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  error : string;
  constructor(private auth: AuthServiceService) { }

  ngOnInit() {
  }
  submitData(form : NgForm) {
    this.error = null;
    this.auth.addbook(form.value)
    .subscribe(res => {
      console.log(res);
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }
}
