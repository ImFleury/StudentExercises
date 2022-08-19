<template>
 <div>
     <h2 class="book-title">{{ book.title }}</h2>
     <h3 class="book-author">{{ book.author }}</h3>
     <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
     <p>{{book.read === true ? "I have read this book" : "I have not read this book yet"}}</p>
 </div>
</template>

<script>
export default {
    name: 'book-detail',
    computed: {
        book() {
            let currentBook = this.$store.state.books.find((aBook) => {
                return aBook.isbn === this.$route.params.isbn
            })
            if (currentBook != null) {
                return currentBook;
            } else {
                return this.$store.state.popularBooks.find((aBook) => {
                    return aBook.isbn === this.$route.params.isbn;
                })
            }
        }
    }
}
</script>
<template>
  <form class="new-book-form" v-on:submit.prevent="saveBook">
    <input class="title-input" type="text" placeholder="Title" v-model="book.title" />
    <input class="author-input" type="text" placeholder="Author" v-model="book.author" />
    <input class="isbn-input" type="text" placeholder="ISBN" v-model="book.isbn" />
    <button>Save</button>
  </form>
</template>

<script>
export default {
    name: "new-book-form",
    data() {
        return {
            book: {
                title: '',
                author: '',
                read: false,
                isbn: ''
            }
        }
    },
    methods: {
        saveBook() {
            this.$store.commit('SAVE_BOOK', this.book);
            this.book = {
                title: '',
                author: '',
                read: false,
                isbn: ''
            };
            this.$router.push({name: 'my-books'})
        }
    }
}
</script>

<style>
.new-book-form {
    margin: 20px;
}
.new-book-form input, .new-book-form button {
    margin: 10px;
    font-size: 1rem;
}
</style>