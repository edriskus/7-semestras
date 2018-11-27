# Bibliotekos Realizavimui

## [gpu.js](http://gpu.rocks/)

*GPU.js is a JavaScript Acceleration library for GPGPU (General purpose computing on GPUs) in JavaScript. GPU.js will automatically compile simple JavaScript functions into shader language and run them on the GPU. In case a GPU is not available, the functions will still run in regular JavaScript.*

- Veiksmai aprašomi "kernel" funkcijomis
- Leidžiama naudoti apribotą "JavaScript" sintaksę
- Naudoja WebGL

## [TensorFlow.js](https://js.tensorflow.org/)

*TensorFlow is an open-source software library for dataflow programming across a range of tasks. It is a symbolic math library, and is also used for machine learning applications such as neural networks. It is used for both research and production at Google.‍*

- TensorFlow.js has an API similar to the TensorFlow Python API, however it does not support all of the functionality of the TensorFlow Python API.
- For inference, TensorFlow.js with WebGL is 1.5-2x slower than TensorFlow Python with AVX.
- For training, we have seen small models train faster in the browser and large models train up to 10-15x slower in the browser, compared to TensorFlow Python with AVX.
- deeplearn.js is now called TensorFlow.js Core.

## [Socket.io](https://socket.io/)

*Socket.IO enables real-time, bidirectional and event-based communication.
It works on every platform, browser or device, focusing equally on reliability and speed.*

## Emscripten (converts to asm.js)

*Emscripten is a source-to-source compiler that runs as a back end to the LLVM compiler and produces a subset of JavaScript known as asm.js. It can also produce WebAssembly. This allows applications and libraries originally designed to run as standard executables to be integrated into client side web applications. asm.js can be compiled by browsers ahead of time meaning that the compiled programs can run much faster than those traditionally written in JavaScript.*

*Emscripten has been used to port, among other things, Unreal Engine 3, SQLite, MeshLab, Bullet physics, AutoCAD, and the Qt application framework.*

## WebAssembly

*WebAssembly (Wasm, WA) is a web standard that defines a binary format and a corresponding assembly-like text format for executable code in Web pages. It is meant to enable executing code nearly as quickly as running native machine code. It was envisioned to complement JavaScript to speed up performance-critical parts of web applications and later on to enable web development in languages other than JavaScript. WebAssembly does not attempt to replace JavaScript, but to complement it. It is developed at the World Wide Web Consortium (W3C) with engineers from Mozilla, Microsoft, Google, and Apple.*

## HTML5 WebWorkers

*A web worker, as defined by the World Wide Web Consortium (W3C) and the Web Hypertext Application Technology Working Group (WHATWG), is a JavaScript script executed from an HTML page that runs in the background, independently of user-interface scripts that may also have been executed from the same HTML page. Web workers are often able to utilize multi-core CPUs more effectively.*

## WebGL

*WebGL (Web Graphics Library) is a JavaScript API for rendering interactive 2D and 3D graphics within any compatible web browser without the use of plug-ins. WebGL is fully integrated with other web standards, allowing GPU-accelerated usage of physics and image processing and effects as part of the web page canvas. WebGL elements can be mixed with other HTML elements and composited with other parts of the page or page background. WebGL programs consist of control code written in JavaScript and shader code that is written in OpenGL ES Shading Language (GLSL ES), a language similar to C or C++, and is executed on a computer's graphics processing unit (GPU). WebGL is designed and maintained by the non-profit Khronos Group.*

**WebGL 2.0 is based on OpenGL ES 3.0**

## [Monaco Editor](https://microsoft.github.io/monaco-editor/)

*The Monaco Editor is the code editor that powers VS Code.*