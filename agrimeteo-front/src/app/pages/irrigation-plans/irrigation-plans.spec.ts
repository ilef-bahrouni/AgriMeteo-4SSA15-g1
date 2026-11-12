import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IrrigationPlans } from './irrigation-plans';

describe('IrrigationPlans', () => {
  let component: IrrigationPlans;
  let fixture: ComponentFixture<IrrigationPlans>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [IrrigationPlans],
    }).compileComponents();

    fixture = TestBed.createComponent(IrrigationPlans);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
