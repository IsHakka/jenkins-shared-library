import com.example.Docker

def call(String imageName) {
    return new Docker(script).buildDockerImage(imageName)
}