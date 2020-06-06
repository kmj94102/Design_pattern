package com.example.designpattern.builder

class ComputerBuilder {
    val computer = Computer("default", "default", "default")
    companion object{
        fun start() : ComputerBuilder {
            return ComputerBuilder()
        }

        fun startWithCpu(cpu : String) : ComputerBuilder{
            val builder = ComputerBuilder()
            builder.computer.cpu = cpu
            return builder
        }
    }

    fun setCpu(string : String) : ComputerBuilder{
        computer.cpu
        return this
    }

    fun setRam(string: String) : ComputerBuilder{
        computer.ram
        return this
    }

    fun setStorage(string : String) : ComputerBuilder{
        computer.storage
        return this
    }

    fun build() : Computer{
        return this.computer
    }
}