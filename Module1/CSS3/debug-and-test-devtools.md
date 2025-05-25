# 11. Debug and Test with Dev Tools and VS Code

## Scenario:
Some users report layout issues on smaller screens. Use browser developer tools and VS Code to identify and fix problems.

---

## ✅ Objectives:
- Test styles on various screen sizes
- Inspect applied CSS styles
- Verify external CSS is loading properly

---

## 🛠️ Steps to Debug with Chrome DevTools:

### 1. Simulate Different Screen Sizes
- Open the browser
- Press `F12` or `Ctrl + Shift + I` to open DevTools
- Toggle device toolbar using `Ctrl + Shift + M`
- Select various devices (e.g., iPhone, iPad, Galaxy)

### 2. Inspect Styles
- Navigate to the "Elements" tab
- Select an element to view its applied CSS rules
- Modify styles in real-time to test layout fixes

### 3. Check External CSS
- Go to the "Network" tab in DevTools
- Reload the page (`Ctrl + R`)
- Look for `styles.css`
  - Ensure the status is `200 OK`
  - Confirm the file size is as expected

---

## ✅ Testing in VS Code:

1. Open the project folder in VS Code
2. Right-click on `index.html` and choose **"Open with Live Server"** (if using Live Server extension)
3. Use VS Code's built-in browser preview or Chrome
4. Make live CSS edits and observe changes instantly

---

## 📌 Tips:
- Use "Layout" panel in Chrome DevTools to toggle Flex/Grid overlays
- Use the "Issues" tab to detect CSS errors or browser compatibility warnings
- Check the Console for JavaScript or resource loading errors

---

## 🧪 Bonus:
Use [Lighthouse](https://developers.google.com/web/tools/lighthouse/) in DevTools for performance and accessibility audits.
