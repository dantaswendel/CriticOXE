package br.com.wendel.criticoxe.mapper

interface Mapper<T, U> {

    fun map(c:T): U
}
