import { RouterProvider } from 'react-router-dom';
import router from './components/router.tsx';
import './App.css'
import '@fontsource/roboto/400.css';

function App() {

  return (
    <>
      <RouterProvider router={router} />
    </>
  )
}

export default App
