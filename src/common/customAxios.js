
import axios from 'axios'; // 액시오스
import dotenv from 'dotenv';
dotenv.config();

console.log('process.env.REACT_APP_SPRING_URL : ',process.env.REACT_APP_SPRING_URL);

export default function npmcustomAxios(url, callback) {
  axios(
    {
      url: '/api' + url,
      method: 'post',
      headers: {"Access-Control-Allow-Origin": "*"},


      baseURL: process.env.REACT_APP_SPRING_URL, //현재 spring-boot 백엔드 주소
      withCredentials: false,
    }
  ).then(function (response) {
    callback(response.data);
    //callback(response.headers.get("jwt-token"));
  });
}