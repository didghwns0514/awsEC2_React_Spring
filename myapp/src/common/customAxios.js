
import axios from 'axios'; // 액시오스
require('dotenv').config();

export default function customAxios(url, callback) {
  axios(
    {
      url: '/api' + url,
      method: 'post',
      headers: {"Access-Control-Allow-Origin": "*"},


      baseURL: '127.0.0.1:8080', //현재 spring-boot 백엔드 주소
      withCredentials: false,
    }
  ).then(function (response) {
    callback(response.data);
    //callback(response.headers.get("jwt-token"));
  });
}