import { WebPlugin } from '@capacitor/core';
import { CapExamplePlugin } from './definitions';

export class CapExampleWeb extends WebPlugin implements CapExamplePlugin {
  constructor() {
    super({
      name: 'CapExample',
      platforms: ['web'],
    });
  }

  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

const CapExample = new CapExampleWeb();

export { CapExample };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(CapExample);
