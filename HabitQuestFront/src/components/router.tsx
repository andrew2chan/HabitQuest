import { createBrowserRouter } from "react-router-dom";
import LandingPage from "./landing-page/LandingPage";

const router = createBrowserRouter([
    {
        path: "/",
        children: [
            {
                index: true,
                element: <LandingPage />
            }
        ]
    }
]);

export default router;