import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {
  isLibrarian: any;
  isStudent: any;
  librarianLogut() {
    throw new Error('Method not implemented.');
  }
  studentLogout() {
    throw new Error('Method not implemented.');
  }
  id;

  isSLoggedIn: any;
  isLLoggedIn:any;
  isAuthenticated() {
    throw new Error('Method not implemented.');
  }



  constructor(private http: HttpClient) { }


  isLibrarianLoggedIn() {
    if (this.isLLoggedIn) {
      return true;
    }
    return false;
  }

  isStudentLoggedIn() {
    if (this.isSLoggedIn) {
      return true;
    }
    return false;
  }


  registerUser(user): Observable<any> {
    return this.http.post(`http://localhost:8084/librarymanagment/register`, user);
    }

    loginUser(user): Observable<any> {
      

      return this.http.post(`http://localhost:8084/librarymanagment/login`, user);
    }
    deleteUser(user): Observable<any> {
      return this.http.delete(`http://localhost:8084/librarymanagment/delete/${user.id}`, user);
    }
    addbook(book): Observable<any> {
      return this.http.post(`http://localhost:8084/librarymanagment/addbook`, book);
    }
    // tslint:disable-next-line: whitespace
    deletebook(book): Observable<any> {
      return this.http.delete(`http://localhost:8084/librarymanagment/deletebook/${book.book_id}`, book);
    }
    searchbook(book): Observable<any> {
      return this.http.get(`${'http://localhost:8084/librarymanagment/get'}/${book.book_id}`,book);
    }
    requestBook(form){
      const issue = 'issue';
      console.log('issue request')
      console.log('user id', this.id)
      return this.http.put<any>(`http://localhost:8084/librarymanagment/request/${this.id}/${form.book_id}/${issue}`,form);
  
    }
 
}