package com.project.localstripe.service.impl;


import com.project.localstripe.service.BalanceService;
import com.stripe.exception.StripeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class BalanceServiceImpl implements BalanceService {

    @Override
    public String getBalance(){
        log.info(":: Inside getBalance() ::");
        String response = """
                  "object": "balance",
                  "available": [
                    {
                      "amount": 2217713,
                      "currency": "cad",
                      "source_types": {
                        "bank_account": 0,
                        "card": 2217713
                      }
                    },
                    {
                      "amount": 2685,
                      "currency": "nok",
                      "source_types": {
                        "bank_account": 0,
                        "card": 2685
                      }
                    },
                    {
                      "amount": 7254790,
                      "currency": "gbp",
                      "source_types": {
                        "bank_account": 0,
                        "card": 7254790
                      }
                    },
                    {
                      "amount": 218420,
                      "currency": "nzd",
                      "source_types": {
                        "bank_account": 0,
                        "card": 218420
                      }
                    },
                    {
                      "amount": 779902,
                      "currency": "czk",
                      "source_types": {
                        "bank_account": 0,
                        "card": 779902
                      }
                    },
                    {
                      "amount": -1854,
                      "currency": "aud",
                      "source_types": {
                        "bank_account": 0,
                        "card": -1854
                      }
                    },
                    {
                      "amount": 539511156239,
                      "currency": "usd",
                      "source_types": {
                        "bank_account": 368200608,
                        "card": 539141403505
                      }
                    },
                    {
                      "amount": -76455,
                      "currency": "eur",
                      "source_types": {
                        "bank_account": 0,
                        "card": -76455
                      }
                    },
                    {
                      "amount": -40320,
                      "currency": "jpy",
                      "source_types": {
                        "bank_account": 0,
                        "card": -40320
                      }
                    },
                    {
                      "amount": 12000,
                      "currency": "brl",
                      "source_types": {
                        "bank_account": 0,
                        "card": 12000
                      }
                    },
                    {
                      "amount": -412,
                      "currency": "sek",
                      "source_types": {
                        "bank_account": 0,
                        "card": -412
                      }
                    }
                  ],
                  "connect_reserved": [
                    {
                      "amount": 0,
                      "currency": "cad"
                    },
                    {
                      "amount": 0,
                      "currency": "nok"
                    },
                    {
                      "amount": 0,
                      "currency": "gbp"
                    },
                    {
                      "amount": 0,
                      "currency": "nzd"
                    },
                    {
                      "amount": 0,
                      "currency": "czk"
                    },
                    {
                      "amount": 0,
                      "currency": "aud"
                    },
                    {
                      "amount": 83080,
                      "currency": "usd"
                    },
                    {
                      "amount": 54584,
                      "currency": "eur"
                    },
                    {
                      "amount": 0,
                      "currency": "jpy"
                    },
                    {
                      "amount": 0,
                      "currency": "brl"
                    },
                    {
                      "amount": 0,
                      "currency": "sek"
                    }
                  ],
                  "livemode": false,
                  "pending": [
                    {
                      "amount": 0,
                      "currency": "cad",
                      "source_types": {
                        "bank_account": 0,
                        "card": 0
                      }
                    },
                    {
                      "amount": 0,
                      "currency": "nok",
                      "source_types": {
                        "bank_account": 0,
                        "card": 0
                      }
                    },
                    {
                      "amount": 0,
                      "currency": "gbp",
                      "source_types": {
                        "bank_account": 0,
                        "card": 0
                      }
                    },
                    {
                      "amount": 0,
                      "currency": "nzd",
                      "source_types": {
                        "bank_account": 0,
                        "card": 0
                      }
                    },
                    {
                      "amount": 0,
                      "currency": "czk",
                      "source_types": {
                        "bank_account": 0,
                        "card": 0
                      }
                    },
                    {
                      "amount": 0,
                      "currency": "aud",
                      "source_types": {
                        "bank_account": 0,
                        "card": 0
                      }
                    },
                    {
                      "amount": 4617024161,
                      "currency": "usd",
                      "source_types": {
                        "bank_account": 0,
                        "card": 4617024161
                      }
                    },
                    {
                      "amount": 0,
                      "currency": "eur",
                      "source_types": {
                        "bank_account": 0,
                        "card": 0
                      }
                    },
                    {
                      "amount": 0,
                      "currency": "jpy",
                      "source_types": {
                        "bank_account": 0,
                        "card": 0
                      }
                    },
                    {
                      "amount": 0,
                      "currency": "brl",
                      "source_types": {
                        "bank_account": 0,
                        "card": 0
                      }
                    },
                    {
                      "amount": 0,
                      "currency": "sek",
                      "source_types": {
                        "bank_account": 0,
                        "card": 0
                      }
                    }
                  ]
                }
                """;
        return response;
    }
}
