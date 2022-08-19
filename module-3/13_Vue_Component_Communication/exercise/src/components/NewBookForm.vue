<template>
  <form class="new-book-form" v-on:submit.prevent="saveBook">
    <input class="title-input" type="text"  v-model="newBook.title" />
    <input class="author-input" type="text"  v-model="newBook.author" />
    <input class="isbn-input" type="text"  v-model="newBook.isbn" />
    <input type="submit" value="Save"/>
  </form>
</template>

<script>
export default {
    name: "new-book-form",
    data() {
        return {
            newBook: {
                read: false,
            }
        }
    },
    methods: {
        saveBook() {
            this.$store.commit('SAVE_BOOK', this.newBook);
            
        }
    }
}
</script>

<style>
</style>