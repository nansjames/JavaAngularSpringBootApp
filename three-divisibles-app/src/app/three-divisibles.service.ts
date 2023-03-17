import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class ThreeDivisiblesService {
  private apiServerUrl = 'http://localhost:8080';
  constructor(private http:HttpClient){}

  public getResult(result: number) : Observable<number>{
    return this.http.get<number>(`${this.apiServerUrl}/threedivisibles/${result}`);
  }
}
