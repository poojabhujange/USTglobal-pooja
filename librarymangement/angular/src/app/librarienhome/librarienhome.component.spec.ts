import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LibrarienhomeComponent } from './librarienhome.component';

describe('LibrarienhomeComponent', () => {
  let component: LibrarienhomeComponent;
  let fixture: ComponentFixture<LibrarienhomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LibrarienhomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LibrarienhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
