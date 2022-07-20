const { Kafka } = require('kafkajs')

const kafka = new Kafka({
  clientId: 'my-app',
  requestTimeout: 25000,
  connectionTimeout: 30000,
  authenticationTimeout:30000,
  retry: {
    initialRetryTime: 3000,
    retries: 0
  },
  brokers: ['localhost:9092']
})

const producer = kafka.producer()

setInterval(async ()=>{
    await producer.connect()
    await producer.send({
        topic: 'test',
        messages: [
          { value: 'Hello KafkaJS user!' },
        ],
      })
},1000)