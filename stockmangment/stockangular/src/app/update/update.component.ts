import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthServiceService } from '../auth.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  error: any;
  selectedproduct: any;

  constructor(private auth : AuthServiceService) { }

  ngOnInit() {
  }


  edit(update) {
    console.log('edited ', update.value);
    this.auth.updatestock(update.value).subscribe(data => {
      console.log('updated success', data);
    }, err => {
      console.log('error');
    }, () => {
      console.log('updated success');
    });
  }


}
