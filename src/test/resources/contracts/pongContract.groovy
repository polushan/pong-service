import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description "should return pong"
    request{
        method GET()
        url("/pong") {
        }
    }
    response {
        body("pong")
        status 200
    }
}