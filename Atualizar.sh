#!/bin/bash
git status
git add .
git commit -m "$1"
git push origin master
