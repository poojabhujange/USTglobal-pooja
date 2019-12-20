import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  isLibrarian: any;
  isStudent: any;
  notLogin: boolean;

  constructor(private service: AuthServiceService,
              private router: Router) { }



get isLLoggedIn() {
return this.service.isLibrarianLoggedIn();
}

get isSLoggedIn() {
return this.service.isStudentLoggedIn();
}

studentLogout(){
  this.service.studentLogout();
  }
  librarianLogout(){
    this.service.librarianLogut();
  }

  ngDoCheck(){
  
    this.isLibrarian = this.service.isLibrarian;
    this.isStudent = this.service.isStudent;
    if (this.isLibrarian) {
      this.notLogin = false;
    } else {
      this.notLogin = true;
    }
    if (this.isStudent) {
      this.notLogin = false;
    } else {
      this.notLogin = true;
    }
  }






  ngOnInit() {
  }

}
