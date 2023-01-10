<template>

    <v-data-table
        :headers="headers"
        :items="selectItem"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SelectItemView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            selectItem : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/selectItems'))

            temp.data._embedded.selectItems.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.selectItem = temp.data._embedded.selectItems;
        },
        methods: {
        }
    }
</script>

