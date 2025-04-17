interface Serviceable {
    /**
     * Performs standard service on the vehicle.
     * No parameters. No return value.
     */
    void performStandardService();

    /**
     * Checks the engine status.
     *
     * @return true if engine is functioning properly, false otherwise
     */
    boolean checkEngineStatus();
}
