package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEAsAr+uoZzDcyO1oZTN41z3Fw7/2dIljx7V/FVxEaGG5B5z/T1\r\n" + 
			"8j+z7p92H3KEVtB3eT9hmlzfziS5uYQSZtzH9mdKhYnSonI63axsJkoMLBWzKpIb\r\n" + 
			"N6cU1hJH9yA49mk+hvBKo7pTgjn6lgFAe3sCg4os+77raQfY7nL7CFJ5hDr/qLBO\r\n" + 
			"E6qtut08wElk2222r/n8mvRmiDB66lL1Z4L1xwsZVvuqzJwZPyp5axM73/HJ/ZXQ\r\n" + 
			"phIZt/QqTxi2rBJt0c48AQLoBZG23n7zy3awetl+ZXL2t/pgzcCYJG1/irtztC5w\r\n" + 
			"RcfM6ryZENaNDwZEnu7jLHlupQXDUAp8w/71GwIDAQABAoIBACVNfyKJINIYuV+t\r\n" + 
			"wO5xk85q4O/Cs/fZww0kf1cC1qH6oEU3k/IMG5WBxqbtPiujKt3PV2A9M9Nbptsv\r\n" + 
			"qDKRr/F/e6QGS1LOv7h/M799S00AICHyKcBGMD0YTJWKB2f3bx9qxXYiIlXi8T1d\r\n" + 
			"8Ir5ytOSsOt7TijIV+hXBuiBiWxCNcqB2dfB6Yz5naVw/05nNEAlKP4RnvaMhDG9\r\n" + 
			"YXATa2Mpkv/oHJD5pnpY4t9HsaW3bHBsmoiSvbCoHGd9tKBJDmjxQChMVK8N1MgV\r\n" + 
			"O+JBQrQsUDlo2vCp8EhEOd0+hhE6f7r+Ll1nv4Oqkp+HyjKP33k84LJx7JKJAJb6\r\n" + 
			"TDFlnLkCgYEA6hNE+1zEVB4xnnMaMfhetBHJn78beZ8ng4q8ShAT38YGa7iuHAQu\r\n" + 
			"ibrzKyyvGNBLlUF9znDz4OdTdh54BDeQLLVfhzz1xLutFIcZooP7yiGsWwaDRYD8\r\n" + 
			"NZ+nMXfhHq4AGrRWdpFzoUBDgAZUS+eHl+/6liuwGOaIZVJPHfUWa8cCgYEAwIg1\r\n" + 
			"Um09combJRfzu9RbX1GRSfDVPOm1ULPJao3kYE2A9e2WdR7YTnYNNzKQb7kBeO1C\r\n" + 
			"ANJXRZnmPNovsP+7aCx+wr9cJgKGDLp/2GngTwxguqGOoMxs2bbWR1OhrtOKfzk2\r\n" + 
			"pgA9cTrn4kUtoG+N07nE1UiPGZoue8zTxkSwpA0CgYEAoH7l5ZQN6b9qNkKly22J\r\n" + 
			"Qd6QaMAYjqPZ7A/MWtv7RIv7CxFuEDet0TImWYwh4tmveX+WS16XWbZDO9JYaEvQ\r\n" + 
			"x1b1UT0zJtmoK1MW+J+WnVnJXABzMcznIb1+XiTcbrTPzX+paVMB/aaaocW1NvZh\r\n" + 
			"uoQJRb5e2DP5gb+WD+xkmzECgYEAoBEd87dqfM02tTIiqyg0Bx0zY3vcbNYIrl2q\r\n" + 
			"uPHays3kx5GNozXPs/ulpRxexOPU+4qVc0Vs1SrMJg9n0wnp7wP/Jz4dCGTUucRc\r\n" + 
			"AbqUiGPMD529jKYoYSEHKSm4pDavUHJqorxUWM0WeCH3ewkDquEpagD3J9vthXOX\r\n" + 
			"JaF6EgkCgYA/mvY/yiHQWCcITSumm0aTzb2pRZ3CC8jtZ3KBINYRFTZzDM049OFh\r\n" + 
			"lrnSEyLsf/u6ehptFeeE63r/kpCkWezb/ksPrV6zBAzNAIf/nznV9zuKX7CkVXKS\r\n" + 
			"AZb7KG8wvJZSv2AWZ2EDqshD4vtq1S5WdVl3pz8TX3Ac40hA5iIfDA==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsAr+uoZzDcyO1oZTN41z\r\n" + 
			"3Fw7/2dIljx7V/FVxEaGG5B5z/T18j+z7p92H3KEVtB3eT9hmlzfziS5uYQSZtzH\r\n" + 
			"9mdKhYnSonI63axsJkoMLBWzKpIbN6cU1hJH9yA49mk+hvBKo7pTgjn6lgFAe3sC\r\n" + 
			"g4os+77raQfY7nL7CFJ5hDr/qLBOE6qtut08wElk2222r/n8mvRmiDB66lL1Z4L1\r\n" + 
			"xwsZVvuqzJwZPyp5axM73/HJ/ZXQphIZt/QqTxi2rBJt0c48AQLoBZG23n7zy3aw\r\n" + 
			"etl+ZXL2t/pgzcCYJG1/irtztC5wRcfM6ryZENaNDwZEnu7jLHlupQXDUAp8w/71\r\n" + 
			"GwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
