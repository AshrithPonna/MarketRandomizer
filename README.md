# Project: Market Randomization
## Project Relevance
The purpose of this project is to reduce the time spent looking for well-performing and lesser known stocks, comparative to the more well-known grouping(s). A more _diversified_ array of assets can be visible here. 

## Project Scope (MVP)
There are several important criterion in the base model for prioritization:
* **Yahoo Finance (API)** referenced to access financial information and metrics.
* User is prompted for an input, which is linked to program functionality ("yes"/"no"); this is correlative to a **looped system**.
* Financial metrics are stored in an array, which, in a **randomized** methodology, are visibly presented in groups of **3**.

## Flowchart Representation (Architecture)
`This is representative of the functionality and logistics behind this program; each identifier corresponds to a certain function of the program and how it relates to various inputs, outputs, libraries, etc.`

<img width="797" height="457" alt="StockMarketRandomizer_AshrithPonna drawio" src="https://github.com/user-attachments/assets/6d7d304b-3f17-4b1f-a4b7-a22754ca567c" />

## Future Plans
`Every aspect listed are generalized ideas and are not limited to the ideas themselves.`
* Add a functionality element to the system that integrates another user prompt for the specific industry/sector.
* Add a graph that is representative of an asset's financial performance over time.
* Allow the user to prioritize shown assets, which are saved in a database, impacting future algorithm outputs.
* Showing extra financial details about assets (just being more in-depth about metrics in general).
* Incorporating the ability for users to change the number of stocks being presented randomly (i.e., count = 1 --> count = 5).

## Technical Stack
* API(s): Yahoo Finance (API) data handling and migration
* Language(s): Java
* IDE(s): Visual Studio Code
* Function(s): Math.random() and Java.io.*

_Last Updated: 10/27/2026 @ 5:30 P.M._
