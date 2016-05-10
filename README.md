# CoverMe

This project is an automatic cover letter writer.
It scrapes the job posting page for key words.
Based on those keywords. The appropriate sections of the cover letter will be placed together.

The Cover letter is split into paragraphs (Sections).
each will be populated with the possible text found in that section's associated file (in inputFiles)

The implementation here uses JSON:
When building the sections the page is requested and a Rabin Karp search algorithm is run on the page
for the keys. Those keys found will have that section of the text added.

Essentially if the posting is a mobile position, your letter will explain your experience with
android and IOS but leave out all that shameful PHP and ML experience

I'm not sure I can advise using this but enjoy.
