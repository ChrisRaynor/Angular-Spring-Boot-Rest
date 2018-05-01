
import {Component, OnInit} from '@angular/core';
import {MatTableDataSource} from '@angular/material';
import {User} from './user.model';
import {ApiService} from '../app.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  displayedColumns = ['firstName', 'lastName', 'email'];
  dataSource = new MatTableDataSource<User>();


  constructor(private router: Router, private apiService: ApiService) {
  }
  ngOnInit(): void {
    this.apiService.getUsers().subscribe(
      (data: User[]) => {
        this.dataSource.data = data;
      }
    );
  }
}

