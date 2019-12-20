import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { DeleteuserComponent } from './deleteuser/deleteuser.component';
import { AddbookComponent } from './addbook/addbook.component';
import { DeletebookComponent } from './deletebook/deletebook.component';
import { SearchbookComponent } from './searchbook/searchbook.component';
import { DisplayallbookComponent } from './displayallbook/displayallbook.component';
import { StudenthomeComponent } from './studenthome/studenthome.component';
import { RequestbookComponent } from './requestbook/requestbook.component';
import { IssuebookComponent } from './issuebook/issuebook.component';
import { LibrarienhomeComponent } from './librarienhome/librarienhome.component';
import { ReturnComponent } from './return/return.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    DeleteuserComponent,
    AddbookComponent,
    DeletebookComponent,
    SearchbookComponent,
    DisplayallbookComponent,
    StudenthomeComponent,
    RequestbookComponent,
    IssuebookComponent,
    LibrarienhomeComponent,
    ReturnComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'login', component : LoginComponent},
      {path : 'register', component : RegisterComponent},
      {path : 'addbook', component : AddbookComponent},
      {path : 'deleteuser', component : DeleteuserComponent },
      {path : 'deletebook', component : DeletebookComponent},
      {path : 'search' , component : SearchbookComponent},
      {path : 'display', component : DisplayallbookComponent},
      {path : 'studenthome', component:  StudenthomeComponent},
      {path : 'request', component: RequestbookComponent}

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
