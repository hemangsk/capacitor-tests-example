declare module '@capacitor/core' {
  interface PluginRegistry {
    CapExample: CapExamplePlugin;
  }
}

export interface CapExamplePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
