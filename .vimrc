set number
set relativenumber
syntax on

" Set leader key
let mapleader = " "

" Esc keybinding
inoremap jj <esc>
xnoremap <leader> <esc>
" Ctrl+c is used to bypass historical oddiity
cnoremap jj <C-C>

" Save keybinding
nnoremap aa :w<cr>
inoremap aa <esc>:w<cr>
vnoremap aa :w<cr>
