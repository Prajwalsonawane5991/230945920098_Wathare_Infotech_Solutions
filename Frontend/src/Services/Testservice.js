import axios from 'axios';

const Test_BASE_RESTAPI_URL = 'http://localhost:8084/test/';

class TestService{

  getData()
  {
    return axios.get(Test_BASE_RESTAPI_URL + 'api');
  }
}
export default new TestService();