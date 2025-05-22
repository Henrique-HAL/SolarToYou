#!/bin/bash
branch=$(git branch --show-current)
echo "🔄 Atualizando o branch '$branch' com o GitHub..."
git pull origin $branch
