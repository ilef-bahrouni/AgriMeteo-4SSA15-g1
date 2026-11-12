import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IrrigationSystems } from './irrigation-systems';

describe('IrrigationSystems', () => {
  let component: IrrigationSystems;
  let fixture: ComponentFixture<IrrigationSystems>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [IrrigationSystems],
    }).compileComponents();

    fixture = TestBed.createComponent(IrrigationSystems);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
