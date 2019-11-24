import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { AssignmentComponent } from './assignment/assignment.component';
import { TwowayBindingComponent } from './data-binding/twoway-binding/twoway-binding.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DirectivesComponent } from './directives/directives.component';
import { StructuralComponent } from './directives/structural/structural.component';
import { NgifComponent } from './directives/structural/ngif/ngif.component';
import { NgforComponent } from './directives/structural/ngfor/ngfor.component';
import { NgswitchComponent } from './directives/structural/ngswitch/ngswitch.component';
import { CustomDirective } from './custom.directive';
import { FormComponent } from './form/form.component';
import { Form1Component } from './form/form1/form1.component';
import { Form2Component } from './form/form2/form2.component';
import { Form3Component } from './form/form3/form3.component';
import { Form4Component } from './form/form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { from } from 'rxjs';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    RegisterComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    AssignmentComponent,
    TwowayBindingComponent,
    DirectivesComponent,
    StructuralComponent,
    NgifComponent,
    NgforComponent,
    NgswitchComponent,
    CustomDirective,
    FormComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent
  ],
  imports: [
    BrowserModule,
    // AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : '', component : HomeComponent},
      {path : 'about', component : AboutComponent},
      {path : 'help', component : HelpComponent},
      {path : 'property-binding', component : PropertyBindingComponent},
      {path : 'event-binding', component : EventBindingComponent},
      {path : 'assignment', component : AssignmentComponent},
      {path : 'twoway', component : TwowayBindingComponent},
      {path : 'login', component : NgifComponent},
      {path : 'ngfor', component : NgforComponent},
      {path : 'ngswitch', component : NgswitchComponent},
      {path : 'register', component : RegisterComponent},
      {path : 'form1', component : Form1Component},
      {path : 'form2', component : Form2Component},
      {path : 'form3', component : Form3Component},
      {path : 'form4', component : Form4Component},
      {path : 'reactive', component : ReactiveFormComponent},
      {path : 'parent', component : ParentComponent},
      {path : 'comment-details', component : CommentDetailsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
