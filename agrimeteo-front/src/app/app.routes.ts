import { Routes } from '@angular/router';

export const routes: Routes = [
  { path: '', redirectTo: 'dashboard', pathMatch: 'full' },
  {
    path: 'dashboard',
    loadComponent: () =>
      import('./pages/dashboard/dashboard').then(m => m.Dashboard)
  },
  {
    path: 'irrigation-plans',
    loadComponent: () =>
      import('./pages/irrigation-plans/irrigation-plans').then(m => m.IrrigationPlans)
  },
  {
    path: 'irrigation-rules',
    loadComponent: () =>
      import('./pages/irrigation-rules/irrigation-rules').then(m => m.IrrigationRules)
  },
  {
    path: 'irrigation-systems',
    loadComponent: () =>
      import('./pages/irrigation-systems/irrigation-systems').then(m => m.IrrigationSystems)
  },
  {
    path: 'irrigation-records',
    loadComponent: () =>
      import('./pages/irrigation-records/irrigation-records').then(m => m.IrrigationRecords)
  },
  {
    path: 'recommendations',
    loadComponent: () =>
      import('./pages/recommendations/recommendations').then(m => m.Recommendations)
  },
  {
    path: 'crop-water-requirements',
    loadComponent: () =>
      import('./pages/crop-water-requirements/crop-water-requirements').then(m => m.CropWaterRequirements)
  },
  { path: '**', redirectTo: 'dashboard' }
];