variable "registry_server" {
  type = string
  default = "https://hub.docker.com/"
}

variable "registry_username" {
  type = string
  default = "toptun"
}

variable "registry_password" {
  type = string
  sensitive = true
  default = "Zajebali1234"
}
