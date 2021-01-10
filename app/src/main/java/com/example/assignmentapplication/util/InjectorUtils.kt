package com.example.assignmentapplication.util

import com.example.assignmentapplication.data.FakeDatabase
import com.example.assignmentapplication.data.QuoteRepository
import com.example.assignmentapplication.ui.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        // ViewModelFactory needs a repository, which in turn needs a DAO from a database

        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}
