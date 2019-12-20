import { Component, OnInit } from '@angular/core';
import { AuthServiceService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addstock',
  templateUrl: './addstock.component.html',
  styleUrls: ['./addstock.component.css']
})
export class AddstockComponent implements OnInit {
  error: any;

  constructor( private auth: AuthServiceService) { }

  ngOnInit() {
  }
  submitData(form : NgForm) {
    this.error = null;
    this.auth.addstock(form.value)
    .subscribe(res => {
      console.log(res);
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }



}
