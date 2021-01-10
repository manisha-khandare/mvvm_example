package com.example.assignmentapplication.ui

import androidx.lifecycle.ViewModel
import com.example.assignmentapplication.data.Quote
import com.example.assignmentapplication.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}