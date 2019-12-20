import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayallbookComponent } from './displayallbook.component';

describe('DisplayallbookComponent', () => {
  let component: DisplayallbookComponent;
  let fixture: ComponentFixture<DisplayallbookComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplayallbookComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplayallbookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
