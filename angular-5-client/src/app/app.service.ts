
import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {User} from './user/user.model';


const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable()
export class ApiService {

  private userUrl = 'http://localhost:8080/user-portal/api';

  constructor(private http: HttpClient) {}

  public getUsers() {
    return this.http.get(this.userUrl);
  }
}
