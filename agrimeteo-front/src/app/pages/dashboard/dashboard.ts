import { Component } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.scss'
})
export class Dashboard {

  statistics = [
    { title: 'Total Plans', value: '24', icon: '📅', color: 'green' },
    { title: 'Active Systems', value: '12', icon: '💧', color: 'blue' },
    { title: 'Recommendations', value: '08', icon: '💡', color: 'orange' },
    { title: 'Water Used', value: '1,250 L', icon: '🌊', color: 'purple' }
  ];

}